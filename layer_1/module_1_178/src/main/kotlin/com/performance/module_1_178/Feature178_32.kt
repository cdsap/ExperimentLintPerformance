package com.performance.module_1_178

class Feature178UseCase0(
    private val repository: Feature178Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
