package com.performance.module_0_71

class Feature71UseCase2(
    private val repository: Feature71Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
