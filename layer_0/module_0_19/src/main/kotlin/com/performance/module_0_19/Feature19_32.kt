package com.performance.module_0_19

class Feature19UseCase0(
    private val repository: Feature19Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
