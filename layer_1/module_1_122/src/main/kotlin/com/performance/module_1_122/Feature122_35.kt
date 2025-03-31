package com.performance.module_1_122

class Feature122UseCase1(
    private val repository: Feature122Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
