package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;

public class ValidadorMedicoConsultaMesmoHorario {

    private ConsultaRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
        var medicoConsultaMesmaHora = repository.existsByMedicoIdAndData(dados.idMedico(), dados.data());
        if(medicoConsultaMesmaHora){
            throw new ValidacaoException("Médico já possui outra consulta nesse horário.");
        }
    }
}
