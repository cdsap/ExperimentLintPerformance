package com.performance.module_0_71

class Feature71UseCase0(
    private val repository: Feature71Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
