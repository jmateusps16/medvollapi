package med.voll.api.domain.consulta;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(
        //@JsonAlias("id_medico")
        Long idMedico,

        //@JsonAlias("id_paciente")
        @NotNull
        Long idPaciente,

        @NotNull
        @Future
        LocalDateTime data
){}