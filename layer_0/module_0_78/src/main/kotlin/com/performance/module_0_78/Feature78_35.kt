package com.performance.module_0_78

class Feature78UseCase1(
    private val repository: Feature78Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
