package models

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PacienteTest {

    @Test
    fun `verificar creacion correcta de paciente`() {
        // 1. Preparar datos
        val paciente = Paciente("Juan Perez", "8711234567", "Penicilina")

        // 2. Ejecutar prueba
        val resumen = paciente.obtenerResumen()

        // 3. Validar resultado (Si esto es verdad, Travis-CI dará un check verde)
        assertEquals("Juan Perez - Tel: 8711234567", resumen)
    }
}