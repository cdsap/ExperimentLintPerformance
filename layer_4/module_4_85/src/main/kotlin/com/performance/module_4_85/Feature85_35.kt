package com.performance.module_4_85

class Feature85UseCase1(
    private val repository: Feature85Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
