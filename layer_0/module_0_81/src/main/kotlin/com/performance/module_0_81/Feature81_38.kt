package com.performance.module_0_81

class Feature81UseCase2(
    private val repository: Feature81Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
