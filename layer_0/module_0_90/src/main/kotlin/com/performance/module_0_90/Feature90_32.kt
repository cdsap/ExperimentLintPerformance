package com.performance.module_0_90

class Feature90UseCase0(
    private val repository: Feature90Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
