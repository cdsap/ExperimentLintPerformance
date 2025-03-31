package com.performance.module_2_205

class Feature205UseCase1(
    private val repository: Feature205Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
