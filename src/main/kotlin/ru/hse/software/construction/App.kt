package ru.hse.software.construction

import ru.hse.software.construction.controller.CinemaController
import ru.hse.software.construction.repository.CinemaRepository

fun main() {
    val cinemaRepository = CinemaRepository()
    val session = cinemaRepository.loadSession("session.json")
    //cinemaRepository.saveSession(session, "session.json")

    val cinemaController = CinemaController()
    cinemaController.scheduleMenu(session)
}