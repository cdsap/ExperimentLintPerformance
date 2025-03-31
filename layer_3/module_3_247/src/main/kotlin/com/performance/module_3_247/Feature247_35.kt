package com.performance.module_3_247

class Feature247UseCase1(
    private val repository: Feature247Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
