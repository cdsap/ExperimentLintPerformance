package com.performance.module_4_290

class Feature290UseCase2(
    private val repository: Feature290Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
