package com.performance.module_0_78

class Feature78UseCase0(
    private val repository: Feature78Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
