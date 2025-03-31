package com.performance.module_3_178

class Feature178UseCase1(
    private val repository: Feature178Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
