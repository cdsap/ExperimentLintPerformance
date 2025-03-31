package com.performance.module_0_122

class Feature122UseCase0(
    private val repository: Feature122Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
