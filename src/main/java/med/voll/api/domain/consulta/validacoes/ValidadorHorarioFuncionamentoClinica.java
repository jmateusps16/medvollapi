package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import med.voll.api.domain.exceptions.ValidacaoException;

import java.time.DayOfWeek;

public class ValidadorHorarioFuncionamentoClinica {

    public void validar(DadosAgendamentoConsulta dados) {
        var dataConsulta = dados.data();

        var domingo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var antesDaAberturaDaClinica = dataConsulta.getHour() < 7;
        var ultimoHorarioConsulta = dataConsulta.getHour() > 18;

        if (domingo || antesDaAberturaDaClinica || ultimoHorarioConsulta) {
            throw new ValidacaoException("Consulta fora do horário de funcionamento da clinica");
        }
    }
}
