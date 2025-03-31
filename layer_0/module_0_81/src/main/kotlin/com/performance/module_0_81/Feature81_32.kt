package com.performance.module_0_81

class Feature81UseCase0(
    private val repository: Feature81Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
