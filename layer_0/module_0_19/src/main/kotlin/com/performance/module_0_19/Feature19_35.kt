package com.performance.module_0_19

class Feature19UseCase1(
    private val repository: Feature19Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
