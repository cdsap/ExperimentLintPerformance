package com.performance.module_3_71

class Feature71UseCase1(
    private val repository: Feature71Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
