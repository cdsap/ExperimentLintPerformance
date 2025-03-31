package com.performance.module_3_243

class Feature243UseCase1(
    private val repository: Feature243Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
