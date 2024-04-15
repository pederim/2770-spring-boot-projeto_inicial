package med.voll.api.domain.consultas;

import java.time.LocalDateTime;

public record DadosDetalhamentoConsulta(Long id, Long IdMedico, Long idPaciente, LocalDateTime data) {
}
