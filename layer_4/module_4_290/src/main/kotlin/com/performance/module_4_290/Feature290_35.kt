package com.performance.module_4_290

class Feature290UseCase1(
    private val repository: Feature290Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
