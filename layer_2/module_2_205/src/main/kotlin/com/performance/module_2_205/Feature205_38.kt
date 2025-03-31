package com.performance.module_2_205

class Feature205UseCase2(
    private val repository: Feature205Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
