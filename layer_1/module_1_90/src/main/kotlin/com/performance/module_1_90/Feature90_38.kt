package com.performance.module_1_90

class Feature90UseCase2(
    private val repository: Feature90Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
