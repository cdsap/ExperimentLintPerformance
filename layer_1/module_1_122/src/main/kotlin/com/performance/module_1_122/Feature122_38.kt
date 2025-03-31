package com.performance.module_1_122

class Feature122UseCase2(
    private val repository: Feature122Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
