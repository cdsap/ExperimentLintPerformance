package com.performance.module_2_205

class Feature205UseCase0(
    private val repository: Feature205Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
