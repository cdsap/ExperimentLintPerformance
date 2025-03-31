package com.performance.module_4_290

class Feature290UseCase0(
    private val repository: Feature290Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
