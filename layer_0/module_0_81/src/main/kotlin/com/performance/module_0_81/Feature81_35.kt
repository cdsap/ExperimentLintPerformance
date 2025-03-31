package com.performance.module_0_81

class Feature81UseCase1(
    private val repository: Feature81Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
