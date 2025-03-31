package com.performance.module_4_85

class Feature85UseCase0(
    private val repository: Feature85Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
