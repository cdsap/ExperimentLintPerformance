package com.performance.module_0_78

class Feature78UseCase2(
    private val repository: Feature78Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
