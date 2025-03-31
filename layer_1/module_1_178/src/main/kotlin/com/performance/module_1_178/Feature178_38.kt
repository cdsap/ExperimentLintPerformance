package com.performance.module_1_178

class Feature178UseCase2(
    private val repository: Feature178Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
