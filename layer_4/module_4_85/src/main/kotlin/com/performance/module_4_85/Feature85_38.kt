package com.performance.module_4_85

class Feature85UseCase2(
    private val repository: Feature85Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
