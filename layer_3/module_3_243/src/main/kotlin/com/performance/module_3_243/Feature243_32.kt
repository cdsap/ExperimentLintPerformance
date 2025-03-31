package com.performance.module_3_243

class Feature243UseCase0(
    private val repository: Feature243Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
