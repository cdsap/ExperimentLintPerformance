package com.performance.module_2_238

class Feature238UseCase2(
    private val repository: Feature238Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
