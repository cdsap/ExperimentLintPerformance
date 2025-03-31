package com.performance.module_3_247

class Feature247UseCase2(
    private val repository: Feature247Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
