package com.performance.module_0_122

class Feature122UseCase1(
    private val repository: Feature122Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
