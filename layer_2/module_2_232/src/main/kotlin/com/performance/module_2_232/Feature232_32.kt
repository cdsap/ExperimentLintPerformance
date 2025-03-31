package com.performance.module_2_232

class Feature232UseCase0(
    private val repository: Feature232Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
