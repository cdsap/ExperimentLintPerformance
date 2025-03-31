package com.performance.module_3_247

class Feature247UseCase0(
    private val repository: Feature247Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
