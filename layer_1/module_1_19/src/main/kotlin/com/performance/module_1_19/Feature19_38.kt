package com.performance.module_1_19

class Feature19UseCase2(
    private val repository: Feature19Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
