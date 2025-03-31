package com.performance.module_2_238

class Feature238UseCase0(
    private val repository: Feature238Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
