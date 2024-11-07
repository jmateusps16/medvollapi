package med.voll.api.domain.consulta;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.medico.Especialidade;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(
        //@JsonAlias("id_medico")
        Long idMedico,

        //@JsonAlias("id_paciente")
        @NotNull
        Long idPaciente,

        @NotNull
        @Future
        //@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
        LocalDateTime data,

        Especialidade especialidade
){}