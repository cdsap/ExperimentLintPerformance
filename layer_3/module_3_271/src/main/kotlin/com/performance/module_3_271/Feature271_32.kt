package com.performance.module_3_271

class Feature271UseCase0(
    private val repository: Feature271Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
