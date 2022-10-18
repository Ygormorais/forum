package br.com.alura.forum.model

import java.time.LocalDateTime

data class Respostas(
    val id: Long? = null,
    val mensagem: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    val autor: Usuario,
    val Topico: Topico,
    val solucao: Boolean
)
