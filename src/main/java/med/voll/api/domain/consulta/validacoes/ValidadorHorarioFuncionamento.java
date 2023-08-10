package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;

import java.time.DayOfWeek;

public class ValidadorHorarioFuncionamento {

    public void validar(DadosAgendamentoConsulta dados){
        // segunda a sabado
        // 07:00 am ate 19:00 pm
        var dataConsulta = dados.data();

        boolean domingo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        boolean antesDaAbertura = dataConsulta.getHour() < 7;
        boolean depoisDoFechamento = dataConsulta.getHour() > 18;

        if(domingo || antesDaAbertura || depoisDoFechamento){
            throw new ValidacaoException("Consulta fora do horário de funcionamento.");
        }
    }
}
