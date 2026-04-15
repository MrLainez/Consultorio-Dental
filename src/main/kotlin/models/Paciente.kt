package models

class Paciente(
    val nombre: String,
    val telefono: String,
    val alergias: String
) {
    fun obtenerResumen(): String {
        return "$nombre - Tel: $telefono"
    }
}
//Forzar
