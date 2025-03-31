package com.performance.module_3_243

class Feature243UseCase2(
    private val repository: Feature243Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
