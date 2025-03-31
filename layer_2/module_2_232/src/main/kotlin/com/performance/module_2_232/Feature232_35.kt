package com.performance.module_2_232

class Feature232UseCase1(
    private val repository: Feature232Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
