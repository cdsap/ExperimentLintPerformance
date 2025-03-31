package com.performance.module_3_266

class Feature266UseCase2(
    private val repository: Feature266Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
