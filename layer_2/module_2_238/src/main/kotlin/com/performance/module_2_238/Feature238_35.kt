package com.performance.module_2_238

class Feature238UseCase1(
    private val repository: Feature238Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
