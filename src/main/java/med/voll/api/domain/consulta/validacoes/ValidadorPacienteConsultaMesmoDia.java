package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;

public class ValidadorPacienteConsultaMesmoDia {

    private ConsultaRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
        var primeiroHorario = dados.data().withHour(7);
        var ultimoHorario = dados.data().withHour(18);
        var pacientePossuiOutraConsultaDia = repository.existsByPacienteIdAndDataBetween(dados.idPaciente(),
                primeiroHorario, ultimoHorario);

        if(pacientePossuiOutraConsultaDia){
            throw new ValidacaoException("Paciente já possui uma consulta agendada nesse dia.");
        }
    }
}
