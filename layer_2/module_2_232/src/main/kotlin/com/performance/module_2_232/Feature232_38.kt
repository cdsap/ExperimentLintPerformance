package com.performance.module_2_232

class Feature232UseCase2(
    private val repository: Feature232Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
