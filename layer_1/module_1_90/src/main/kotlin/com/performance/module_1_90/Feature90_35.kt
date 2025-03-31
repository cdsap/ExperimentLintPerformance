package com.performance.module_1_90

class Feature90UseCase1(
    private val repository: Feature90Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
